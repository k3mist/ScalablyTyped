package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSEvent extends js.Object {
  var Records: js.Array[SNSEventRecord]
}

object SNSEvent {
  @scala.inline
  def apply(Records: js.Array[SNSEventRecord]): SNSEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[SNSEvent]
  }
}

