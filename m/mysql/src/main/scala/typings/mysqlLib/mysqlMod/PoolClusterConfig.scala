package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolClusterConfig extends js.Object {
  /**
    * If true, PoolCluster will attempt to reconnect when connection fails. (Default: true)
    */
  var canRetry: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default selector. (Default: RR)
    * RR: Select one alternately. (Round-Robin)
    * RANDOM: Select the node by random function.
    * ORDER: Select the first node available unconditionally.
    */
  var defaultSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If connection fails, node's errorCount increases. When errorCount is greater than removeNodeErrorCount,
    * remove a node in the PoolCluster. (Default: 5)
    */
  var removeNodeErrorCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * If connection fails, specifies the number of milliseconds before another connection attempt will be made.
    * If set to 0, then node will be removed instead and never re-used. (Default: 0)
    */
  var restoreNodeTimeout: js.UndefOr[scala.Double] = js.undefined
}

object PoolClusterConfig {
  @scala.inline
  def apply(
    canRetry: js.UndefOr[scala.Boolean] = js.undefined,
    defaultSelector: java.lang.String = null,
    removeNodeErrorCount: scala.Int | scala.Double = null,
    restoreNodeTimeout: scala.Int | scala.Double = null
  ): PoolClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canRetry)) __obj.updateDynamic("canRetry")(canRetry)
    if (defaultSelector != null) __obj.updateDynamic("defaultSelector")(defaultSelector)
    if (removeNodeErrorCount != null) __obj.updateDynamic("removeNodeErrorCount")(removeNodeErrorCount.asInstanceOf[js.Any])
    if (restoreNodeTimeout != null) __obj.updateDynamic("restoreNodeTimeout")(restoreNodeTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolClusterConfig]
  }
}

