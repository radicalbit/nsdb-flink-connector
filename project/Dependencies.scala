/*
 * Copyright 2018 Radicalbit S.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sbt._

object Dependencies {

  object flink {
    lazy val version        = "1.6.2"
    lazy val namespace      = "org.apache.flink"
    lazy val streamingScala = namespace %% "flink-streaming-scala" % version
  }

  object nsdb {
    lazy val version   = "0.8.0-SNAPSHOT"
    lazy val namespace = "io.radicalbit.nsdb"
    lazy val scalaAPI  = namespace %% "nsdb-scala-api" % version
  }

  lazy val libraries = Seq(
    flink.streamingScala % Provided,
    nsdb.scalaAPI
  )
}
