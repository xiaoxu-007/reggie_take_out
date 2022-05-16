package com.xu007.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xu007.reggie.entity.Category;
import org.springframework.stereotype.Service;

/**
 * @author Xu007
 * @create 2022-05-15 23:02
 */

public interface CategoryService extends IService<Category> {

    public void remove (Long id);
}
