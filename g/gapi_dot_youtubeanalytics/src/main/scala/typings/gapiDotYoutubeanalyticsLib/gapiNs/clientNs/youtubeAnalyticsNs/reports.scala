package typings
package gapiDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeAnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reports extends js.Object {
  /**
    * Retrieve your YouTube Analytics reports.
    */
  def query(`object`: gapiDotYoutubeanalyticsLib.Anon_Dimensions): gapiLib.gapiNs.clientNs.HttpRequest[_]
}

object reports {
  @scala.inline
  def apply(query: gapiDotYoutubeanalyticsLib.Anon_Dimensions => gapiLib.gapiNs.clientNs.HttpRequest[_]): reports = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[reports]
  }
}

