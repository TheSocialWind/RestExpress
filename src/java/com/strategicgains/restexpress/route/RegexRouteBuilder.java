/*
    Copyright 2011, Strategic Gains, Inc.

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
package com.strategicgains.restexpress.route;

/**
 * @author toddf
 * @since Jan 13, 2011
 */
public class RegexRouteBuilder
extends RouteBuilder
{
	/**
	 * @param uri
	 * @param controller
	 * @param routeType
	 */
	public RegexRouteBuilder(String uri, Object controller)
	{
		super(uri, controller, RouteTypes.REGEX);
	}
}