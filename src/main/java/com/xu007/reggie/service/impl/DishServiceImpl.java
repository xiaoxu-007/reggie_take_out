package com.xu007.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xu007.reggie.entity.Dish;
import com.xu007.reggie.mapper.DishMapper;
import com.xu007.reggie.service.DishService;
import org.springframework.stereotype.Service;

/**
 * @author Xu007
 * @create 2022-05-16 2:03
 */
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
