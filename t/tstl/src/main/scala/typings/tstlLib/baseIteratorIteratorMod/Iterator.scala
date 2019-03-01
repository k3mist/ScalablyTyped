package typings
package tstlLib.baseIteratorIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/iterator/IReverseIterator.IReversableIterator<tstl.tstl/iterator/IReverseIterator.IReversableIterator<T, IteratorT, ReverseIteratorT>, IteratorT, ReverseIteratorT> ]: tstl.tstl/iterator/IReverseIterator.IReversableIterator<tstl.tstl/iterator/IReverseIterator.IReversableIterator<T, IteratorT, ReverseIteratorT>, IteratorT, ReverseIteratorT>[P]} */ trait Iterator[T /* <: Elem */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends js.Object {
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIteratorT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[T /* <: Elem */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](reverse: js.Function0[ReverseIteratorT], source: js.Function0[SourceT]): Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = {
    val __obj = js.Dynamic.literal(reverse = reverse, source = source)
  
    __obj.asInstanceOf[Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem]]
  }
}

