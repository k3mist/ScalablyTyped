package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection Pool options
  *
  * @see Options
  */
trait PoolOptions extends js.Object {
  /**
    * The maximum time, in milliseconds, that pool will try to get connection before throwing error
    */
  var acquire: js.UndefOr[scala.Double] = js.undefined
  /*
    * The time interval, in milliseconds, for evicting stale connections
    */
  var evict: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum time, in milliseconds, that a connection can be idle before being released.
    */
  var idle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum connections of the pool
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum connections of the pool
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function that validates a connection. Called with client. The default function checks that client is an
    * object, and that its state is not disconnected.
    */
  var validate: js.UndefOr[js.Function1[/* client */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
}

object PoolOptions {
  @scala.inline
  def apply(
    acquire: scala.Int | scala.Double = null,
    evict: scala.Int | scala.Double = null,
    idle: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    validate: js.Function1[/* client */ js.UndefOr[js.Any], scala.Boolean] = null
  ): PoolOptions = {
    val __obj = js.Dynamic.literal()
    if (acquire != null) __obj.updateDynamic("acquire")(acquire.asInstanceOf[js.Any])
    if (evict != null) __obj.updateDynamic("evict")(evict.asInstanceOf[js.Any])
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[PoolOptions]
  }
}

