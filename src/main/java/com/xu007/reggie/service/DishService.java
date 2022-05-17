package com.xu007.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xu007.reggie.mapper.dto.DishDto;
import com.xu007.reggie.entity.Dish;

/**
 * @author Xu007
 * @create 2022-05-16 2:02
 */
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张边坡
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIDWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
