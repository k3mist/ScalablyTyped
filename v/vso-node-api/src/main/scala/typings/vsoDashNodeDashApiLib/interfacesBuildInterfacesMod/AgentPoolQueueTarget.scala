package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolQueueTarget extends PhaseTarget {
  /**
    * Enables scripts and other processes launched while executing phase to access the OAuth token
    */
  var allowScriptsAuthAccessOption: scala.Boolean
  var demands: js.Array[_]
  /**
    * The execution options.
    */
  var executionOptions: AgentTargetExecutionOptions
  /**
    * The queue.
    */
  var queue: AgentPoolQueue
}

object AgentPoolQueueTarget {
  @scala.inline
  def apply(
    allowScriptsAuthAccessOption: scala.Boolean,
    demands: js.Array[_],
    executionOptions: AgentTargetExecutionOptions,
    queue: AgentPoolQueue,
    `type`: scala.Double
  ): AgentPoolQueueTarget = {
    val __obj = js.Dynamic.literal(allowScriptsAuthAccessOption = allowScriptsAuthAccessOption, demands = demands, executionOptions = executionOptions, queue = queue, `type` = `type`)
  
    __obj.asInstanceOf[AgentPoolQueueTarget]
  }
}

