package org.robobinding.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used in your presentation model to configure the ItemPresentationModel information for a data-set property.
 * 
 * @since 1.0
 * @author Cheng Wei
 * @author Robert Taylor
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ItemPresentationModel {
    Class<? extends org.robobinding.itempresentationmodel.ItemPresentationModel<?>> value();

    /**
     * Optional. By default, ItemPresentationModel is created using its default constructor.
     * When factoryMethod is specified. The instance of ItemPresentationModel is created by invoking the PresentationModel.factoryMethod().
     */
    String factoryMethod() default "";
}