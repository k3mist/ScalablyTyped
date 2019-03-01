package typings
package apolloDashServerDashExpressLib.distApolloServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait ApolloServerExpressConfig extends js.Object {
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.Any
  ] = js.undefined
  var cors: js.UndefOr[corsLib.corsMod.eNs.CorsOptions | scala.Boolean] = js.undefined
}

object ApolloServerExpressConfig {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ContextFunction<ExpressContext, Context> */ js.Any = null,
    cors: corsLib.corsMod.eNs.CorsOptions | scala.Boolean = null
  ): ApolloServerExpressConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloServerExpressConfig]
  }
}

