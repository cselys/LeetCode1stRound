
2
3
4
5
6
7
8
9
10
11
void connect(Node* p) {
  if (!p) return;
  if (p->leftChild)
  p->leftChild->nextRight = p->rightChild;
  if (p->rightChild)
    p->rightChild->nextRight = (p->nextRight) ?
                               p->nextRight->leftChild :
                               NULL;
  connect(p->leftChild);
  connect(p->rightChild);
}