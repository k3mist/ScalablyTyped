package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRequest extends js.Object {
  /** The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens. If the document of a (sub-)frame is loaded (type is main_frame or sub_frame), frameId indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique within a tab. */
  var frameId: chromeDashAppsLib.chromeNs.integer
  /** The origin where the request was initiated. This does not change through redirects. If this is an opaque origin, the string 'null' will be used.
    * @since Chrome 63.
    */
  var initiator: js.UndefOr[java.lang.String] = js.undefined
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: chromeDashAppsLib.chromeNs.integer
  /** The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to relate different events of the same request. */
  var requestId: java.lang.String
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: chromeDashAppsLib.chromeNs.integer
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: chromeDashAppsLib.chromeNs.double
  /**
    * How the requested resource will be used.
    */
  var `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType
  var url: java.lang.String
}

object ResourceRequest {
  @scala.inline
  def apply(
    frameId: chromeDashAppsLib.chromeNs.integer,
    parentFrameId: chromeDashAppsLib.chromeNs.integer,
    requestId: java.lang.String,
    tabId: chromeDashAppsLib.chromeNs.integer,
    timeStamp: chromeDashAppsLib.chromeNs.double,
    `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType,
    url: java.lang.String,
    initiator: java.lang.String = null
  ): ResourceRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, `type` = `type`, url = url)
    if (initiator != null) __obj.updateDynamic("initiator")(initiator)
    __obj.asInstanceOf[ResourceRequest]
  }
}

