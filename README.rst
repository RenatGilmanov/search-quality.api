============================
Search Quality API
============================

This project provides initial set of primitives, used for intent-based product search validation.

--------------------------------
A little bit of the background
--------------------------------
Search intent is one of the most important aspects of the modern search. It is the reason why people conduct a search. Moreover, it allows not only to find proper products, but also to verify suggested products are relevant. Basically, search intent helps to understand what users mean to find when they enter their search keywords. 

Clear intent makes search result validation way more simpler and straightforward. There are several validation strategies possible. The actual strategy implementation is out of scope of this project. 

--------------------------------
Validation results
--------------------------------
Search Quality API defines the following set of "verdicts" for a product being returned: relevant, near, misplaced, irrelevant, undefined:

Relevant 
  The product ranking is completely relevant.

Near 
  The product ranking is not a perfect match, but it is clearly reasonable 
  for it to be ranked highly.

Misplaced 
  It is obvious why the search engine returned the result, but it clearly shouldn't be ranked highly.

Irrelevant
  The result has no apparent relationship to the customer’s search.

Undefined 
  For some reason the result is undefined and can not be validated.

--------------------------------
Validation example
--------------------------------
Let's do a quick test with a focused query in order see to how validation works. Intent-based approach is pretty intuitive and straightfowrad. So, if you are searching for "fiskars chopping axe" you do not expect to see any other brands, any other tools etc. Obviously, splitting axe is definitely not an option, as well as any other type on an axe.

.. image:: doc/images/amazon-example-01.png?raw=true
   :align: center

-------
License
-------
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
