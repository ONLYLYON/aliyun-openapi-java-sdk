/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListRequiredServiceForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListRequiredServiceForAdminResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRequiredServiceForAdminResponseUnmarshaller {

	public static ListRequiredServiceForAdminResponse unmarshall(ListRequiredServiceForAdminResponse listRequiredServiceForAdminResponse, UnmarshallerContext context) {
		
		listRequiredServiceForAdminResponse.setRequestId(context.stringValue("ListRequiredServiceForAdminResponse.RequestId"));
		listRequiredServiceForAdminResponse.setNeedOtherService(context.booleanValue("ListRequiredServiceForAdminResponse.NeedOtherService"));

		List<Service> serviceList = new ArrayList<Service>();
		for (int i = 0; i < context.lengthValue("ListRequiredServiceForAdminResponse.ServiceList.Length"); i++) {
			Service service = new Service();
			service.setServiceName(context.stringValue("ListRequiredServiceForAdminResponse.ServiceList["+ i +"].ServiceName"));
			service.setServiceDisplayName(context.stringValue("ListRequiredServiceForAdminResponse.ServiceList["+ i +"].ServiceDisplayName"));

			serviceList.add(service);
		}
		listRequiredServiceForAdminResponse.setServiceList(serviceList);
	 
	 	return listRequiredServiceForAdminResponse;
	}
}