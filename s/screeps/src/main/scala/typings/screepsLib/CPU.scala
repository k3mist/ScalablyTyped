package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPU extends js.Object {
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: scala.Double
  /**
    * Use this method to get heap statistics for your virtual machine.
    *
    * This method will be undefined if you are not using IVM.
    *
    * The return value is almost identical to the Node.js function v8.getHeapStatistics().
    * This function returns one additional property: externally_allocated_size which is the total amount of currently
    * allocated memory which is not included in the v8 heap but counts against this isolate's memory limit.
    * ArrayBuffer instances over a certain size are externally allocated and will be counted here.
    */
  var getHeapStatistics: js.UndefOr[js.Function0[HeapStatistics]] = js.undefined
  /**
    * Your assigned CPU limit for the current shard.
    */
  var limit: scala.Double
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: scala.Double
  /**
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): scala.Double
  /**
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param {CPUShardLimits} limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns {(OK | ERR_BUSY | ERR_INVALID_ARGS)} One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    * @memberof CPU
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS
}

object CPU {
  @scala.inline
  def apply(
    bucket: scala.Double,
    getUsed: js.Function0[scala.Double],
    limit: scala.Double,
    setShardLimits: js.Function1[CPUShardLimits, OK | ERR_BUSY | ERR_INVALID_ARGS],
    shardLimits: CPUShardLimits,
    tickLimit: scala.Double,
    getHeapStatistics: js.Function0[HeapStatistics] = null
  ): CPU = {
    val __obj = js.Dynamic.literal(bucket = bucket, getUsed = getUsed, limit = limit, setShardLimits = setShardLimits, shardLimits = shardLimits, tickLimit = tickLimit)
    if (getHeapStatistics != null) __obj.updateDynamic("getHeapStatistics")(getHeapStatistics)
    __obj.asInstanceOf[CPU]
  }
}

