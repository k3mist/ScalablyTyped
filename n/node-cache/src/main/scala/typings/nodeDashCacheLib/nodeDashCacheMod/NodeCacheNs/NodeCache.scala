package typings
package nodeDashCacheLib.nodeDashCacheMod.NodeCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCache extends js.Object {
  /** container for cached data */
  var data: Data = js.native
  /** module options */
  var options: Options = js.native
  /** statistics container */
  var stats: Stats = js.native
  /**
  		 * This will clear the interval timeout which is set on checkperiod option.
  		 */
  def close(): scala.Unit = js.native
  def del(keys: js.Array[nodeDashCacheLib.Key]): scala.Double = js.native
  def del(keys: js.Array[nodeDashCacheLib.Key], cb: Callback[scala.Double]): scala.Double = js.native
  /**
  		 * remove keys
  		 * @param keys cache key to delete or a array of cache keys
  		 * @param cb Callback function
  		 * @returns Number of deleted keys
  		 */
  def del(keys: nodeDashCacheLib.Key): scala.Double = js.native
  def del(keys: nodeDashCacheLib.Key, cb: Callback[scala.Double]): scala.Double = js.native
  /**
  		 * flush the hole data and reset the stats
  		 */
  def flushAll(): scala.Unit = js.native
  /**
  		 * get a cached key and change the stats
  		 *
  		 * @param key cache key or an array of keys
  		 * @param cb Callback function
  		 */
  def get[T](key: nodeDashCacheLib.Key): js.UndefOr[T] = js.native
  def get[T](key: nodeDashCacheLib.Key, cb: Callback[T]): js.UndefOr[T] = js.native
  /**
  		 * get the stats
  		 *
  		 * @returns Stats data
  		 */
  def getStats(): Stats = js.native
  def getTtl(key: nodeDashCacheLib.Key): js.UndefOr[scala.Double] = js.native
  def getTtl(key: nodeDashCacheLib.Key, cb: Callback[scala.Boolean]): scala.Boolean = js.native
  @JSName("getTtl")
  def getTtl_Boolean(key: nodeDashCacheLib.Key): scala.Boolean = js.native
  /**
  		 * list all keys within this cache
  		 * @param cb Callback function
  		 * @returns An array of all keys
  		 */
  def keys(): js.Array[java.lang.String] = js.native
  def keys(cb: Callback[js.Array[java.lang.String]]): js.Array[java.lang.String] = js.native
  /**
  		 * get multiple cached keys at once and change the stats
  		 *
  		 * @param keys an array of keys
  		 * @param cb Callback function
  		 */
  def mget[T](keys: js.Array[nodeDashCacheLib.Key]): org.scalablytyped.runtime.StringDictionary[T] = js.native
  def mget[T](keys: js.Array[nodeDashCacheLib.Key], cb: Callback[org.scalablytyped.runtime.StringDictionary[T]]): org.scalablytyped.runtime.StringDictionary[T] = js.native
  def set[T](key: nodeDashCacheLib.Key, value: T): scala.Boolean = js.native
  def set[T](key: nodeDashCacheLib.Key, value: T, cb: Callback[scala.Boolean]): scala.Boolean = js.native
  def set[T](key: nodeDashCacheLib.Key, value: T, ttl: java.lang.String): scala.Boolean = js.native
  def set[T](key: nodeDashCacheLib.Key, value: T, ttl: java.lang.String, cb: Callback[scala.Boolean]): scala.Boolean = js.native
  /**
  		 * set a cached key and change the stats
  		 *
  		 * @param key cache key
  		 * @param value A element to cache. If the option `option.forceString` is `true` the module trys to translate
  		 * it to a serialized JSON
  		 * @param ttl The time to live in seconds.
  		 * @param cb Callback function
  		 */
  def set[T](key: nodeDashCacheLib.Key, value: T, ttl: scala.Double): scala.Boolean = js.native
  def set[T](key: nodeDashCacheLib.Key, value: T, ttl: scala.Double, cb: Callback[scala.Boolean]): scala.Boolean = js.native
  def ttl(key: nodeDashCacheLib.Key): scala.Boolean = js.native
  def ttl(key: nodeDashCacheLib.Key, cb: Callback[scala.Boolean]): scala.Boolean = js.native
  /**
  		 * reset or redefine the ttl of a key. If `ttl` is not passed or set to 0 it's similar to `.del()`
  		 */
  def ttl(key: nodeDashCacheLib.Key, ttl: scala.Double): scala.Boolean = js.native
  def ttl(key: nodeDashCacheLib.Key, ttl: scala.Double, cb: Callback[scala.Boolean]): scala.Boolean = js.native
}

