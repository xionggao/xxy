package com.yyjz.xxy.pub.utils;

import java.lang.annotation.Annotation;

import javax.persistence.Table;

/**
 * 实体解析工具(单例)
 * 
 * @author xg
 * @date 2018-08-21
 */
public class BeanHelpler {

	/**
	 * 获取实体对应的表名
	 * 
	 * @param clazz
	 * @return
	 */
	public static String getTableName(Class<?> clazz) {
		if (clazz == null) {
			return null;
		}
		Annotation anno = clazz.getAnnotation(Table.class);
		if (anno == null) {
			return null;
		}
		Table table = (Table) anno;
		return table.name();
	}
}
