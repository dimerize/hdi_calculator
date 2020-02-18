# hdiplus
A simple program for calculating the Hydrogen Deficiency Index of a molecule. The program also returns potential structural features of the molecule.

The calculator assumes the molecule is uncharged and each atom within the molecule exhibits standard valency within the molecular structure.
### Background 
A molecule's hydrogen deficiency index, or HDI, is a measure of the number of rings and π bonds within the molecule's structure. Each organic molecule (with standard valency and charge properties) has a non-negative integer valued HDI. 

The HDI of a molecule is calculated as the total number of 
### Motivation
Calculating a molecule's hydrogen deficiency index is a necessary step in the determination of structural features of organic (and certain inorganic) molecules.
### Functionality
The calculator currently supports HDI calculation for standard organic molecules containing carbon, hydrogen, oxygen, nitrogen, and halogens. The calculator also provides the HDI for certain nitrogenous inorganic molecules, such as hydrazine. The calculator does not support HDI calculations of multivalent halogens, such as interhalogen compounds.

In addition, the calculator returns standard functional group moieties that may be present in the molecule, as well as additional information such as potential aromaticity of the molecule and relevant spectroscopic methods that may prove useful for the provided molecule.

Future steps for the calculator include incorporating higher period elements exhibiting standard valency properties in HDI calculation (e.g. calculating the HDI of pnictogen hydrides, or organic chalcogen/boron group molecules), and refining the potential functional groups the calculator returns after the HDI is calculated. The calculator may also be incorporated into spectroscopic structural analysis programs, such as IR or NMR Spectroscopy interfaces.
