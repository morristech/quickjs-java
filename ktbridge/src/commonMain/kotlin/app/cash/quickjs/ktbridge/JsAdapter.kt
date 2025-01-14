/*
 * Copyright (C) 2021 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.cash.quickjs.ktbridge

import kotlin.reflect.KClass
import okio.Buffer

// TODO(jwilson): Moshi-style nested Factory interface that binds `type` eagerly.
interface JsAdapter {
  fun <T : Any> encode(value: T, sink: Buffer, type: KClass<T>)
  fun <T : Any> decode(source: Buffer, type: KClass<T>): T
}
