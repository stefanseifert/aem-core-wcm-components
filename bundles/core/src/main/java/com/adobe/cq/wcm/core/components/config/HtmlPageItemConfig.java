/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.config;

import org.apache.sling.caconfig.annotation.Property;

/**
 * Nested configuration describing the items that are part of a {@link HtmlPageItemsConfig}.
 */
public @interface HtmlPageItemConfig {

    /**
     * HTML element name.
     *
     * @return HTML element name.
     *
     * @since com.adobe.cq.wcm.core.components.config 1.1.0
     */
    @Property(label = "Element", description = "Name of HTML element", order = 0,
            property = {
                    "widgetType=dropdown",
                    "dropdownOptions=["
                        + "{'value':'link','description':'link'},"
                        + "{'value':'script','description':'script'},"
                        + "{'value':'meta','description':'meta'}"
                        + "]"
                })
    String element() default "";

    /**
     * HTML element name.
     *
     * @return HTML element name.
     *
     * @since com.adobe.cq.wcm.core.components.config 1.1.0
     */
    @Property(label = "Location", description = "Location of element inside HTML markup.", order = 1,
            property = {
                    "widgetType=dropdown",
                    "dropdownOptions=["
                        + "{'value':'header','description':'Header'},"
                        + "{'value':'footer','description':'Footer'},"
                        + "]"
                })
    String location() default "";

}
