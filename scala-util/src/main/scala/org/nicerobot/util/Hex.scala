/*
 * Copyright 2010 Nice Robot Corporation
 * http://nicerobot.com
 *
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
 *
 */
/**
 * 
 */

package org.nicerobot.util;

import scala.StringBuilder._;

/**
 * @author nicerobot
 * 
 */
public class Hex {
	public static String valueOf (final byte buf[]) {
		if (null == buf) {
			return null;
		}
		final StringBuilder sb = new StringBuilder(buf.length * 2);
		for (final byte element : buf) {
			sb.append(String.format("%02X", element & 0xff));
		}
		return sb.toString();
	}
}
