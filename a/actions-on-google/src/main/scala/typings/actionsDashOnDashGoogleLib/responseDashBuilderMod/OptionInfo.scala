package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionInfo extends js.Object {
  /** Unique string ID for this option. */
  var key: java.lang.String
  /** Synonyms that can be used by the user to indicate this option if they do not use the key. */
  var synonyms: js.Array[java.lang.String]
}

object OptionInfo {
  @scala.inline
  def apply(key: java.lang.String, synonyms: js.Array[java.lang.String]): OptionInfo = {
    val __obj = js.Dynamic.literal(key = key, synonyms = synonyms)
  
    __obj.asInstanceOf[OptionInfo]
  }
}

