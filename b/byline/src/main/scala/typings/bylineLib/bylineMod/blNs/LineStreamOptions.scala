package typings
package bylineLib.bylineMod.blNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStreamOptions
  extends nodeLib.streamMod.internalNs.TransformOptions {
  var keepEmptyLines: js.UndefOr[scala.Boolean] = js.undefined
}

object LineStreamOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Duplex, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    encoding: java.lang.String = null,
    `final`: js.ThisFunction1[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    final_TransformOptions: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    flush: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* callback */ nodeLib.streamMod.internalNs.TransformCallback, 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    keepEmptyLines: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ nodeLib.streamMod.internalNs.Duplex, /* size */ scala.Double, scala.Unit] = null,
    read_TransformOptions: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ nodeLib.streamMod.internalNs.TransformCallback, 
      scala.Unit
    ] = null,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    write_TransformOptions: js.ThisFunction3[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): LineStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (destroy_TransformOptions != null) __obj.updateDynamic("destroy")(destroy_TransformOptions)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (final_TransformOptions != null) __obj.updateDynamic("final")(final_TransformOptions)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(keepEmptyLines)) __obj.updateDynamic("keepEmptyLines")(keepEmptyLines)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (read_TransformOptions != null) __obj.updateDynamic("read")(read_TransformOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (write_TransformOptions != null) __obj.updateDynamic("write")(write_TransformOptions)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    if (writev_TransformOptions != null) __obj.updateDynamic("writev")(writev_TransformOptions)
    __obj.asInstanceOf[LineStreamOptions]
  }
}

