package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateMetadata extends AnimationMetadata {
  /**
    * The state name, unique within the component.
    */
  var name: java.lang.String
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[atAngularAnimationsLib.Anon_Name] = js.undefined
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata
}

object AnimationStateMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    styles: AnimationStyleMetadata,
    `type`: AnimationMetadataType,
    options: atAngularAnimationsLib.Anon_Name = null
  ): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name, styles = styles, `type` = `type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationStateMetadata]
  }
}

