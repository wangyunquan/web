package com.buswe.module.cms.editor;

 

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

 

public class SpringUploader {

	public static final State save(HttpServletRequest request,
			Map<String, Object> conf) {
		 if(request instanceof MultipartHttpServletRequest)
		 {
		 MultipartHttpServletRequest  multipartRequest=(MultipartHttpServletRequest)request;
	for(MultipartFile upfile:multipartRequest.getFileMap().values())
	{
		try{
		
		String savePath = (String) conf.get("savePath");
		String originFileName = upfile.getOriginalFilename();
		String suffix = FileType.getSuffixByFilename(originFileName);

		originFileName = originFileName.substring(0,
				originFileName.length() - suffix.length());
		savePath = savePath + suffix;

		long maxSize = ((Long) conf.get("maxSize")).longValue();

		if (!validType(suffix, (String[]) conf.get("allowFiles"))) {
			return new BaseState(false, AppInfo.NOT_ALLOW_FILE_TYPE);
		}

		savePath = PathFormat.parse(savePath, originFileName);

		//modified by Ternence
        String rootPath = ConfigManager.getRootPath(request,conf);
        String physicalPath = rootPath + savePath;
        

	//	InputStream is = upfile.getInputStream();
		State storageState = StorageManager.saveFileByMultipartFile(upfile,
				physicalPath, maxSize);
//		is.close();

		if (storageState.isSuccess()) {
			storageState.putInfo("url", "/"+PathFormat.format(savePath));
			storageState.putInfo("type", suffix);
			storageState.putInfo("original", originFileName + suffix);
		}

			return storageState;
		} catch (Exception e) {
			return new BaseState(false, AppInfo.PARSE_REQUEST_ERROR);
		}  
		
	}
		 
		 }
		 

 	return new BaseState(false, AppInfo.IO_ERROR);
	}

	private static boolean validType(String type, String[] allowTypes) {
		List<String> list = Arrays.asList(allowTypes);

		return list.contains(type);
	}
}
