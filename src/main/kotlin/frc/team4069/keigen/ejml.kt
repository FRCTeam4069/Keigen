package frc.team4069.keigen

import org.ejml.dense.row.factory.DecompositionFactory_DDRM
import org.ejml.simple.SimpleMatrix

fun SimpleMatrix.chol() = DecompositionFactory_DDRM.chol(this.numCols(), true).also {
    it.decompose(this.ddrm.copy())
}

fun SimpleMatrix.LU() = DecompositionFactory_DDRM.lu(this.numRows(), this.numCols()).also {
    it.decompose(this.ddrm.copy())
}

fun SimpleMatrix.QR() = DecompositionFactory_DDRM.qr(this.numRows(), this.numCols()).also {
    it.decompose(this.ddrm.copy())
}
