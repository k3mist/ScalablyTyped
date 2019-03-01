package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var bodySize: scala.Double
  var contentType: java.lang.String
  var headers: js.Array[phantomLib.Anon_Name]
  var id: java.lang.String
  var redirectURL: java.lang.String
  var stage: phantomLib.phantomLibStrings.start | phantomLib.phantomLibStrings.end
  var status: scala.Double
  var statusText: java.lang.String
  var time: stdLib.Date
  var url: java.lang.String
}

object IResponse {
  @scala.inline
  def apply(
    bodySize: scala.Double,
    contentType: java.lang.String,
    headers: js.Array[phantomLib.Anon_Name],
    id: java.lang.String,
    redirectURL: java.lang.String,
    stage: phantomLib.phantomLibStrings.start | phantomLib.phantomLibStrings.end,
    status: scala.Double,
    statusText: java.lang.String,
    time: stdLib.Date,
    url: java.lang.String
  ): IResponse = {
    val __obj = js.Dynamic.literal(bodySize = bodySize, contentType = contentType, headers = headers, id = id, redirectURL = redirectURL, stage = stage.asInstanceOf[js.Any], status = status, statusText = statusText, time = time, url = url)
  
    __obj.asInstanceOf[IResponse]
  }
}

