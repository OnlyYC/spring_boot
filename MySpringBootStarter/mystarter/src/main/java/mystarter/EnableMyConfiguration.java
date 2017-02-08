/**
 * Copyright 2016 Iflytek, Inc. All rights reserved.
 */
package mystarter;

import java.lang.annotation.*;

import org.springframework.context.annotation.Import;

/**
 * <p>
 * <code>EnableMyConfiguration</code>
 * </p>
 *
 * @author ybliao2
 * @version 1.0
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyStarterAutoConfiguration.class)
@Documented
public @interface EnableMyConfiguration {
}
