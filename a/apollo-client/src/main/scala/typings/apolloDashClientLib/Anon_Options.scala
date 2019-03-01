package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options[TVariables] extends js.Object {
  var options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables]
  var scheduler: apolloDashClientLib.schedulerSchedulerMod.QueryScheduler[_]
  var shouldSubscribe: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply[TVariables](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables],
    scheduler: apolloDashClientLib.schedulerSchedulerMod.QueryScheduler[_],
    shouldSubscribe: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Options[TVariables] = {
    val __obj = js.Dynamic.literal(options = options, scheduler = scheduler)
    if (!js.isUndefined(shouldSubscribe)) __obj.updateDynamic("shouldSubscribe")(shouldSubscribe)
    __obj.asInstanceOf[Anon_Options[TVariables]]
  }
}

