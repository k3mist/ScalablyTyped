package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  /**
  		 * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 * @default false
  		 */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * number of parllel async tasks
  		*/
  var parallelLimit: js.UndefOr[scala.Double] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(async: js.UndefOr[scala.Boolean] = js.undefined, parallelLimit: scala.Int | scala.Double = null): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (parallelLimit != null) __obj.updateDynamic("parallelLimit")(parallelLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

