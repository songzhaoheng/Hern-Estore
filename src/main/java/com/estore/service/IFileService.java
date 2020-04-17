package com.estore.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @program: Hern-Estore
 * @description: IFileService
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-06 14:01
 **/
public interface IFileService {

    String upload(MultipartFile file, String path);

}
