/**
 * Copyright 2011-2014 eBusiness Information, Groupe Excilys (www.ebusinessinformation.fr)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.core.controller

import scala.util.Try

sealed trait ControllerMessage
case object Run extends ControllerMessage
case class DataWritersInitialized(count: Try[Unit]) extends ControllerMessage
case class ForceTermination(e: Option[Exception] = None) extends ControllerMessage
case class DataWritersTerminated(count: Try[Unit]) extends ControllerMessage
case class ScheduleNextUserBatch(scenarioName: String) extends ControllerMessage
