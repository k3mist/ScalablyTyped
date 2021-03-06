package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "BoostFactorScoreFunction")
@js.native
class BoostFactorScoreFunction protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostFactorScoreFunction {
  /*
    Multiply the score by the provided boost_factor.
    */
  def this(boostVal: scala.Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets the boost factor.
    */
  /* CompleteClass */
  override def boost(b: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostFactorScoreFunction = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  /* CompleteClass */
  override def filter(oFilter: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Filter): elasticDotJsLib.elasticDotJsMod.elasticjsNs.BoostFactorScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

