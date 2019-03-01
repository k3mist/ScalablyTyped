package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  val cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
  val context: TContext
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  val document: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  val operation: js.UndefOr[graphqlLib.languageAstMod.OperationDefinitionNode] = js.undefined
  val operationName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val queryHash: js.UndefOr[java.lang.String] = js.undefined
  val request: GraphQLRequest
  val response: js.UndefOr[GraphQLResponse] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](
    cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String],
    context: TContext,
    request: GraphQLRequest,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    document: graphqlLib.languageAstMod.DocumentNode = null,
    operation: graphqlLib.languageAstMod.OperationDefinitionNode = null,
    operationName: java.lang.String = null,
    queryHash: java.lang.String = null,
    response: GraphQLResponse = null
  ): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache, context = context.asInstanceOf[js.Any], request = request)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (document != null) __obj.updateDynamic("document")(document)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (queryHash != null) __obj.updateDynamic("queryHash")(queryHash)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
}

