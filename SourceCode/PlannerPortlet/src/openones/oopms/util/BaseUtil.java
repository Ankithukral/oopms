/**
 * Licensed to Open-Ones Group under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Open-Ones Group licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package openones.oopms.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

import rocky.common.PropertiesManager;

/**
 * @author Open-Ones team
 */
public class BaseUtil {
    /** Logger for logging. */
    private final static Logger log = Logger.getLogger("AppUtil");

    private static Properties props; 
    static {
        try {
            props = PropertiesManager.newInstanceFromProps("/oopms.properties");
        } catch (IOException ex) {
            log.error("Loading configuration resource '/oopms.properties'", ex);
        }
    }

    /** . */
    final static SimpleDateFormat sdf = new SimpleDateFormat(props.getProperty("DateFMT"));

    /**
     * [Give the description for method].
     * @return
     */
    public static String getCurrentDate() {
        return sdf.format(new Date());
    }
    
    public static Properties getProperies() {
        return props;
    }
}
