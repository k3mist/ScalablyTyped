package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object returned from a success callback for showDialog() of type 'share' or 'share_open_graph'.
  */
trait ShareDialogResult extends BaseDialogResult {
  /**
    * Only available if the user is logged into your app using Facebook and has granted publish_actions.
    * If present, this is the ID of the published Open Graph story.
    */
  var post_id: java.lang.String
}

object ShareDialogResult {
  @scala.inline
  def apply(error_code: java.lang.String, error_message: java.lang.String, post_id: java.lang.String): ShareDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message, post_id = post_id)
  
    __obj.asInstanceOf[ShareDialogResult]
  }
}

