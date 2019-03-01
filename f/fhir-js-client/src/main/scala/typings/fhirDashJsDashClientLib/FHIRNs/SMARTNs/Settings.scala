package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SMART client settings for browser behaviour
  */
trait Settings extends js.Object {
  /**
    * When set to true, this variable will fully utilize HTML5 sessionStorage API.
    * Default to true
    * This variable can be overriden to false by setting FHIR.oauth2.settings.fullSessionStorageSupport = false.
    * When set to false, the sessionStorage will be keyed by a state variable. This is to allow the embedded IE browser
    * instances instantiated on a single thread to continue to function without having sessionStorage data shared
    * across the embedded IE instances.
    */
  var fullSessionStorageSupport: scala.Boolean
  /**
    * Replaces the browser's current URL using window.history.replaceState API.
    * Default to true
    */
  var replaceBrowserHistory: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(fullSessionStorageSupport: scala.Boolean, replaceBrowserHistory: scala.Boolean): Settings = {
    val __obj = js.Dynamic.literal(fullSessionStorageSupport = fullSessionStorageSupport, replaceBrowserHistory = replaceBrowserHistory)
  
    __obj.asInstanceOf[Settings]
  }
}

