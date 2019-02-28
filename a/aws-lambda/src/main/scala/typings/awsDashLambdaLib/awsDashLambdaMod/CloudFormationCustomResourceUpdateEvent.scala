package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceUpdateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var OldResourceProperties: org.scalablytyped.runtime.StringDictionary[js.Any]
  var PhysicalResourceId: java.lang.String
  var RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Update
}

