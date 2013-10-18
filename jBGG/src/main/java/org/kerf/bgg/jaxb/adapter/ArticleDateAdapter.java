/**
   Copyright 2013 Rob Heiser

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.kerf.bgg.jaxb.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ArticleDateAdapter extends XmlAdapter<String, Date> {

   private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ"); // 2011-08-16T10:47:08-05:00

   @Override
   public String marshal(Date v) throws Exception {
      return dateFormat.format(v);
   }

   @Override
   public Date unmarshal(String v) throws Exception {
      v = v.substring(0, v.lastIndexOf(":")) + v.substring(v.lastIndexOf(":") + 1); // Java
                                                                                    // 6
                                                                                    // SimpleDateFormat
                                                                                    // doesn't
                                                                                    // understand
                                                                                    // a
                                                                                    // colon
                                                                                    // in
                                                                                    // the
                                                                                    // timezone
      return dateFormat.parse(v);
   }

}