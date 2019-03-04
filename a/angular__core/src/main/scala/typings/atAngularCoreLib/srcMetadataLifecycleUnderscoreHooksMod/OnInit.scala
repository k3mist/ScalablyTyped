package typings
package atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnInit extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  def ngOnInit(): scala.Unit
}

object OnInit {
  @scala.inline
  def apply(ngOnInit: () => scala.Unit): OnInit = {
    val __obj = js.Dynamic.literal(ngOnInit = js.Any.fromFunction0(ngOnInit))
  
    __obj.asInstanceOf[OnInit]
  }
}

