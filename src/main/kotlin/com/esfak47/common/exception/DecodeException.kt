/*
 *    Copyright 2018 esfak47(esfak47@qq.com)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.esfak47.common.exception

/**
 * Thrown on an unrecoverable problem decode data.
 *
 * @author tony on 2016/6/7.
 */
class DecodeException
/**
 * Constructs a new runtime exception with the specified detail message.
 * The cause is not initialized, and may subsequently be initialized by a
 * call to [.initCause].
 *
 * @param message the detail message. The detail message is saved for
 * later retrieval by the [.getMessage] method.
 */
(message: String) : RuntimeException(message)
