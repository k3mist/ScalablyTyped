package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePipelineCloudWatchActionEvent extends CodePipelineCloudWatchEvent {
  var account: java.lang.String
  var detail: awsDashLambdaLib.Anon_ActionExecutionid
  var `detail-type`: awsDashLambdaLib.awsDashLambdaLibStrings.`CodePipeline Action Execution State Change`
  var id: java.lang.String
  var region: java.lang.String
  var resources: js.Array[java.lang.String]
  var source: awsDashLambdaLib.awsDashLambdaLibStrings.awsDOTcodepipeline
  var time: java.lang.String
  var version: java.lang.String
}

