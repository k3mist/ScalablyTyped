package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionExecutionid extends js.Object {
  var action: java.lang.String
  var `execution-id`: java.lang.String
  var pipeline: java.lang.String
  var stage: java.lang.String
  var state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState
  var `type`: Anon_AWS
  var version: scala.Double
}

object Anon_ActionExecutionid {
  @scala.inline
  def apply(
    action: java.lang.String,
    `execution-id`: java.lang.String,
    pipeline: java.lang.String,
    stage: java.lang.String,
    state: awsDashLambdaLib.awsDashLambdaMod.CodePipelineActionState,
    `type`: Anon_AWS,
    version: scala.Double
  ): Anon_ActionExecutionid = {
    val __obj = js.Dynamic.literal(action = action, pipeline = pipeline, stage = stage, state = state, `type` = `type`, version = version)
    __obj.updateDynamic("execution-id")(`execution-id`)
    __obj.asInstanceOf[Anon_ActionExecutionid]
  }
}

