package typings
package eventemitter2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventemitter2Mod {
  type EventAndListener = js.Function2[
    /* event */ java.lang.String | js.Array[java.lang.String], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type Listener = js.Function1[/* repeated */ js.Any, scala.Unit]
  type eventNS = js.Array[java.lang.String]
}
