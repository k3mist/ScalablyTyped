package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPFRecord extends js.Object {
  var SPFHost: java.lang.String
  var SPFTextValue: java.lang.String
  var SPFVerified: scala.Boolean
}

object SPFRecord {
  @scala.inline
  def apply(SPFHost: java.lang.String, SPFTextValue: java.lang.String, SPFVerified: scala.Boolean): SPFRecord = {
    val __obj = js.Dynamic.literal(SPFHost = SPFHost, SPFTextValue = SPFTextValue, SPFVerified = SPFVerified)
  
    __obj.asInstanceOf[SPFRecord]
  }
}

