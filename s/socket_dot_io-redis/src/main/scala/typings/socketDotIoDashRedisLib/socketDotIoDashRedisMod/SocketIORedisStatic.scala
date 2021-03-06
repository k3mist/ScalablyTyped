package typings
package socketDotIoDashRedisLib.socketDotIoDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketIORedisStatic extends js.Object {
  /**
  	 * Default Redis Adapter constructor
  	 */
  def apply(): socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.RedisAdapter = js.native
  /**
  	 * Creates a new Redis Adapter
  	 * @param opts A parameters object
  	 */
  def apply(opts: socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.SocketIORedisOptions): socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.RedisAdapter = js.native
  /**
  	 * Creates a new Redis Adapter
  	 * @param uri Is a string like localhost:6379 where your redis server is located.
  	 * @param opts An optional parameters object
  	 */
  def apply(uri: java.lang.String): socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.RedisAdapter = js.native
  def apply(
    uri: java.lang.String,
    opts: socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.SocketIORedisOptions
  ): socketDotIoDashRedisLib.socketDotIoDashRedisMod.SocketIORedisNs.RedisAdapter = js.native
}

