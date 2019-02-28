package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date
  extends meteorLib.MongoNs.CurrentDateModifier
     with meteorLib.mongoMod.MongoNs.CurrentDateModifier {
  @JSName("$type")
  var $type: meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibStrings.date
}

