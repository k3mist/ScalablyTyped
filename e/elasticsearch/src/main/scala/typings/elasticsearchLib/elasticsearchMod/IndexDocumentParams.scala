package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexDocumentParams[T] extends GenericParams {
  @JSName("body")
  var body_IndexDocumentParams: T
  var id: js.UndefOr[java.lang.String] = js.undefined
  var index: java.lang.String
  var opType: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.index | elasticsearchLib.elasticsearchLibStrings.create
  ] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var pipeline: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[Refresh] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  var ttl: js.UndefOr[TimeSpan] = js.undefined
  var `type`: java.lang.String
  var version: js.UndefOr[scala.Double] = js.undefined
  var versionType: js.UndefOr[VersionType] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
}

object IndexDocumentParams {
  @scala.inline
  def apply[T](
    body: T,
    index: java.lang.String,
    `type`: java.lang.String,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    opType: elasticsearchLib.elasticsearchLibStrings.index | elasticsearchLib.elasticsearchLibStrings.create = null,
    parent: java.lang.String = null,
    pipeline: java.lang.String = null,
    refresh: Refresh = null,
    requestTimeout: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    timeout: TimeSpan = null,
    timestamp: stdLib.Date | scala.Double = null,
    ttl: TimeSpan = null,
    version: scala.Int | scala.Double = null,
    versionType: VersionType = null,
    waitForActiveShards: java.lang.String = null
  ): IndexDocumentParams[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index, `type` = `type`)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (opType != null) __obj.updateDynamic("opType")(opType.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionType != null) __obj.updateDynamic("versionType")(versionType)
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    __obj.asInstanceOf[IndexDocumentParams[T]]
  }
}

