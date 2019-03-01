package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionsGates extends js.Object {
  /**
    * The Hopfield architecture serves as content-addressable memory. They are trained to remember patterns and then when feeding new patterns to the network it returns the most similar one from the patterns it was trained to remember.
    */
  var Hopfield: org.scalablytyped.runtime.Instantiable1[/* patternSize */ scala.Double, synapticLib.synapticMod.ArchitectNs.Hopfield]
  /**
    * The long short-term memory is an architecture well-suited to learn from experience to classify, process and predict time series when there are very long time lags of unknown size between important events.
    */
  var LSTM: org.scalablytyped.runtime.Instantiable1[
    /* numberOfNeurons (repeated) */ scala.Double, 
    synapticLib.synapticMod.ArchitectNs.LSTM
  ]
  /**
    * The Liquid architecture allows you to create Liquid State Machines. In these networks, neurons are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes.
    */
  var Liquid: org.scalablytyped.runtime.Instantiable5[
    /* input */ scala.Double, 
    /* pool */ scala.Double, 
    /* output */ scala.Double, 
    /* connections */ scala.Double, 
    /* gates */ scala.Double, 
    synapticLib.synapticMod.ArchitectNs.Liquid
  ]
  /**
    * This architecture allows you to create multilayer perceptrons, also known as feed-forward neural networks. They consist of a sequence of layers, each fully connected to the next one.
    */
  var Perceptron: org.scalablytyped.runtime.Instantiable1[
    /* numberOfNeurons (repeated) */ scala.Double, 
    synapticLib.synapticMod.ArchitectNs.Perceptron
  ]
}

object Anon_ConnectionsGates {
  @scala.inline
  def apply(
    Hopfield: org.scalablytyped.runtime.Instantiable1[/* patternSize */ scala.Double, synapticLib.synapticMod.ArchitectNs.Hopfield],
    LSTM: org.scalablytyped.runtime.Instantiable1[
      /* numberOfNeurons (repeated) */ scala.Double, 
      synapticLib.synapticMod.ArchitectNs.LSTM
    ],
    Liquid: org.scalablytyped.runtime.Instantiable5[
      /* input */ scala.Double, 
      /* pool */ scala.Double, 
      /* output */ scala.Double, 
      /* connections */ scala.Double, 
      /* gates */ scala.Double, 
      synapticLib.synapticMod.ArchitectNs.Liquid
    ],
    Perceptron: org.scalablytyped.runtime.Instantiable1[
      /* numberOfNeurons (repeated) */ scala.Double, 
      synapticLib.synapticMod.ArchitectNs.Perceptron
    ]
  ): Anon_ConnectionsGates = {
    val __obj = js.Dynamic.literal(Hopfield = Hopfield, LSTM = LSTM, Liquid = Liquid, Perceptron = Perceptron)
  
    __obj.asInstanceOf[Anon_ConnectionsGates]
  }
}

