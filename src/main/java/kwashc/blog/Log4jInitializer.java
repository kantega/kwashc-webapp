/*
 * Copyright 2012 Kantega AS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kwashc.blog;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Log4jInitializer implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        PropertyConfigurator.configureAndWatch("log4j.properties");
        Logger.getLogger(Log4jInitializer.class).info("log4j initialized OK.");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        // normally we should clean up the thread 'configureAndWatch' created. We skip that in the case...
    }
}
